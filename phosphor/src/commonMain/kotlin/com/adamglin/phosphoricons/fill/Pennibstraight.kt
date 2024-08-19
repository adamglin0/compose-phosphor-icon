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

public val FillGroup.Pennibstraight: ImageVector
    get() {
        if (_pennibstraight != null) {
            return _pennibstraight!!
        }
        _pennibstraight = Builder(name = "Pennibstraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.33f, 123.89f)
                curveToRelative(-0.06f, -0.13f, -0.12f, -0.26f, -0.19f, -0.38f)
                lineTo(192.0f, 69.91f)
                verticalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 32.0f)
                verticalLineTo(69.9f)
                lineTo(33.86f, 123.51f)
                curveToRelative(-0.07f, 0.12f, -0.13f, 0.25f, -0.2f, 0.38f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 1.46f, 16.57f)
                lineToRelative(0.11f, 0.14f)
                lineToRelative(77.61f, 100.81f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 120.0f, 239.0f)
                verticalLineTo(154.63f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 16.0f, 0.0f)
                verticalLineTo(239.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.16f, 2.44f)
                lineToRelative(77.6f, -100.81f)
                lineToRelative(0.11f, -0.14f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 222.33f, 123.89f)
                close()
                moveTo(176.0f, 64.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return _pennibstraight!!
    }

private var _pennibstraight: ImageVector? = null
