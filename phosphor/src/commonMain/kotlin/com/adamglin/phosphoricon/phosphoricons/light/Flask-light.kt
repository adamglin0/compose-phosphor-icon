package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Flask-light`: ImageVector
    get() {
        if (`_flask-light` != null) {
            return `_flask-light`!!
        }
        `_flask-light` = Builder(name = "Flask-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 200.8f)
                lineTo(158.0f, 97.48f)
                verticalLineTo(38.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(98.0f)
                verticalLineTo(97.48f)
                lineTo(36.0f, 200.8f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 222.0f)
                horizontalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.0f, -21.2f)
                close()
                moveTo(109.15f, 102.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.85f, -3.09f)
                verticalLineTo(38.0f)
                horizontalLineToRelative(36.0f)
                verticalLineTo(99.14f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.85f, 3.09f)
                lineToRelative(39.65f, 66.08f)
                curveToRelative(-12.41f, 3.16f, -30.86f, 3.0f, -55.79f, -9.66f)
                curveToRelative(-16.94f, -8.58f, -33.0f, -12.8f, -47.83f, -12.64f)
                close()
                moveTo(209.72f, 209.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.74f, 1.0f)
                horizontalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.71f, -3.0f)
                lineToRelative(29.0f, -48.41f)
                curveToRelative(14.89f, -2.08f, 31.68f, 1.55f, 49.94f, 10.79f)
                curveTo(144.0f, 178.8f, 159.67f, 182.0f, 172.42f, 182.0f)
                arcTo(67.89f, 67.89f, 0.0f, false, false, 192.89f, 179.0f)
                lineToRelative(16.8f, 28.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 209.72f, 209.0f)
                close()
            }
        }
        .build()
        return `_flask-light`!!
    }

private var `_flask-light`: ImageVector? = null
