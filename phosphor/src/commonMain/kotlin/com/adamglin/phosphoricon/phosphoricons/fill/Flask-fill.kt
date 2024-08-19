package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Flask-fill`: ImageVector
    get() {
        if (`_flask-fill` != null) {
            return `_flask-fill`!!
        }
        `_flask-fill` = Builder(name = "Flask-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.69f, 199.77f)
                lineTo(160.0f, 96.92f)
                lineTo(160.0f, 40.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(88.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(96.0f, 96.92f)
                lineTo(34.31f, 199.77f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 224.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.72f, -24.23f)
                close()
                moveTo(131.61f, 156.86f)
                curveToRelative(-15.91f, -8.05f, -31.05f, -12.32f, -45.22f, -12.81f)
                lineToRelative(24.47f, -40.8f)
                arcTo(7.93f, 7.93f, 0.0f, false, false, 112.0f, 99.14f)
                lineTo(112.0f, 40.0f)
                horizontalLineToRelative(32.0f)
                lineTo(144.0f, 99.14f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 1.14f, 4.11f)
                lineTo(183.36f, 167.0f)
                curveTo(171.4f, 169.34f, 154.29f, 168.34f, 131.61f, 156.86f)
                close()
            }
        }
        .build()
        return `_flask-fill`!!
    }

private var `_flask-fill`: ImageVector? = null
