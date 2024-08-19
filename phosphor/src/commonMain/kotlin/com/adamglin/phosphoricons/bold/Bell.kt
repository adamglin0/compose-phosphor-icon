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

public val BoldGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.29f, 165.93f)
                curveTo(216.61f, 151.0f, 212.0f, 129.57f, 212.0f, 104.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f)
                curveToRelative(0.0f, 25.58f, -4.59f, 47.0f, -13.27f, 61.93f)
                arcTo(20.08f, 20.08f, 0.0f, false, false, 30.66f, 186.0f)
                arcTo(19.77f, 19.77f, 0.0f, false, false, 48.0f, 196.0f)
                horizontalLineTo(84.18f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 87.64f, 0.0f)
                horizontalLineTo(208.0f)
                arcToRelative(19.77f, 19.77f, 0.0f, false, false, 17.31f, -10.0f)
                arcTo(20.08f, 20.08f, 0.0f, false, false, 225.29f, 165.93f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -19.6f, -16.0f)
                horizontalLineToRelative(39.2f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(54.66f, 172.0f)
                curveTo(63.51f, 154.0f, 68.0f, 131.14f, 68.0f, 104.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 120.0f, 0.0f)
                curveToRelative(0.0f, 27.13f, 4.48f, 50.0f, 13.33f, 68.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
