package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Paintbrush: ImageVector
    get() {
        if (_paintbrush != null) {
            return _paintbrush!!
        }
        _paintbrush = Builder(name = "Paintbrush", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                curveToRelative(-44.78f, 0.0f, -90.0f, 48.54f, -115.9f, 82.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -80.0f, 62.0f)
                curveToRelative(0.0f, 12.0f, -3.1f, 22.71f, -9.23f, 31.76f)
                arcTo(43.0f, 43.0f, 0.0f, false, true, 9.4f, 206.05f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, -4.91f, 13.38f)
                arcTo(12.07f, 12.07f, 0.0f, false, false, 16.11f, 228.0f)
                horizontalLineToRelative(76.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 154.0f, 148.0f)
                curveTo(187.49f, 122.05f, 236.0f, 76.8f, 236.0f, 32.0f)
                close()
                moveTo(209.62f, 46.39f)
                curveToRelative(-4.0f, 12.92f, -13.15f, 27.49f, -26.92f, 42.91f)
                curveToRelative(-3.0f, 3.39f, -6.16f, 6.7f, -9.35f, 9.89f)
                arcToRelative(104.31f, 104.31f, 0.0f, false, false, -16.5f, -16.51f)
                curveToRelative(3.19f, -3.19f, 6.49f, -6.32f, 9.88f, -9.35f)
                curveTo(182.15f, 59.55f, 196.71f, 50.43f, 209.62f, 46.39f)
                close()
                moveTo(92.07f, 204.0f)
                lineTo(42.0f, 204.0f)
                arcToRelative(80.17f, 80.17f, 0.0f, false, false, 10.14f, -40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, 40.0f)
                close()
                moveTo(130.25f, 112.68f)
                curveToRelative(3.12f, -3.93f, 6.55f, -8.09f, 10.23f, -12.35f)
                arcToRelative(80.52f, 80.52f, 0.0f, false, true, 15.23f, 15.24f)
                curveToRelative(-4.26f, 3.68f, -8.42f, 7.11f, -12.35f, 10.23f)
                arcTo(64.43f, 64.43f, 0.0f, false, false, 130.25f, 112.68f)
                close()
            }
        }
        .build()
        return _paintbrush!!
    }

private var _paintbrush: ImageVector? = null
