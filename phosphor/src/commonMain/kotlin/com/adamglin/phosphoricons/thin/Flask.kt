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

public val ThinGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.27f, 201.83f)
                lineTo(156.0f, 98.0f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(98.0f)
                lineTo(37.73f, 201.83f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 220.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.29f, -18.17f)
                close()
                moveTo(107.43f, 101.2f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, 0.57f, -2.06f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(99.14f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, 0.57f, 2.06f)
                lineToRelative(41.0f, 68.33f)
                curveToRelative(-12.76f, 3.94f, -32.54f, 4.68f, -59.75f, -9.1f)
                curveToRelative(-18.0f, -9.14f, -35.0f, -13.24f, -50.54f, -12.29f)
                close()
                moveTo(211.46f, 210.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -3.48f, 2.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.43f, -6.06f)
                lineToRelative(29.53f, -49.21f)
                curveToRelative(15.54f, -2.43f, 33.05f, 1.21f, 52.07f, 10.84f)
                curveTo(144.54f, 176.86f, 160.0f, 180.0f, 172.42f, 180.0f)
                arcToRelative(65.0f, 65.0f, 0.0f, false, false, 21.36f, -3.46f)
                lineToRelative(17.63f, 29.38f)
                arcTo(3.92f, 3.92f, 0.0f, false, true, 211.46f, 210.0f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
