package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                curveToRelative(0.0f, 0.51f, 0.0f, 1.0f, 0.0f, 1.52f)
                curveToRelative(-0.34f, 14.26f, -5.63f, 30.48f, -28.0f, 30.48f)
                curveToRelative(-23.14f, 0.0f, -28.0f, -17.4f, -28.0f, -32.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.53f, -8.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 160.0f, 88.27f)
                verticalLineToRelative(4.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 6.73f, 64.05f)
                arcToRelative(40.19f, 40.19f, 0.0f, false, false, 3.38f, 5.0f)
                curveTo(175.48f, 168.0f, 185.71f, 176.0f, 204.0f, 176.0f)
                arcToRelative(54.81f, 54.81f, 0.0f, false, false, 9.22f, -0.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.09f, 6.0f)
                arcTo(104.05f, 104.05f, 0.0f, false, true, 125.91f, 232.0f)
                curveTo(71.13f, 230.9f, 26.2f, 186.86f, 24.08f, 132.11f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 128.0f)
                close()
                moveTo(96.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 96.0f, 128.0f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
