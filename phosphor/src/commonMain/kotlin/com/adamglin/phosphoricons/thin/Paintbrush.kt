package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Paintbrush: ImageVector
    get() {
        if (_paintbrush != null) {
            return _paintbrush!!
        }
        _paintbrush = Builder(name = "Paintbrush", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 28.0f)
                curveToRelative(-20.29f, 0.0f, -43.16f, 11.24f, -68.0f, 33.4f)
                curveToRelative(-18.47f, 16.49f, -34.39f, 35.83f, -45.0f, 49.93f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 36.0f, 164.0f)
                curveToRelative(0.0f, 33.22f, -21.26f, 48.0f, -22.22f, 48.68f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 220.0f)
                lineTo(92.0f, 220.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 52.67f, -75.0f)
                curveToRelative(14.11f, -10.63f, 33.44f, -26.55f, 49.93f, -45.0f)
                curveTo(216.76f, 75.16f, 228.0f, 52.29f, 228.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 28.0f)
                close()
                moveTo(92.0f, 212.0f)
                lineTo(26.35f, 212.0f)
                curveTo(33.91f, 203.69f, 44.0f, 188.08f, 44.0f, 164.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f)
                close()
                moveTo(118.52f, 114.69f)
                curveToRelative(4.13f, -5.44f, 9.32f, -12.0f, 15.29f, -18.9f)
                arcToRelative(80.08f, 80.08f, 0.0f, false, true, 26.4f, 26.4f)
                curveToRelative(-6.94f, 6.0f, -13.46f, 11.16f, -18.9f, 15.29f)
                arcTo(56.32f, 56.32f, 0.0f, false, false, 118.52f, 114.69f)
                close()
                moveTo(166.29f, 116.83f)
                arcToRelative(88.17f, 88.17f, 0.0f, false, false, -27.12f, -27.12f)
                curveTo(161.0f, 65.43f, 191.26f, 38.63f, 219.82f, 36.18f)
                curveTo(217.37f, 64.74f, 190.57f, 95.0f, 166.29f, 116.83f)
                close()
            }
        }
        .build()
        return _paintbrush!!
    }

private var _paintbrush: ImageVector? = null
