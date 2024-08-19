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

public val FillGroup.`Security-camera-fill`: ImageVector
    get() {
        if (`_security-camera-fill` != null) {
            return `_security-camera-fill`!!
        }
        `_security-camera-fill` = Builder(name = "Security-camera-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(195.31f)
                lineTo(177.0f, 141.66f)
                lineToRelative(50.34f, -50.35f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.62f)
                lineTo(189.66f, 31.0f)
                horizontalLineToRelative(0.0f)
                lineTo(171.31f, 12.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(2.92f, 158.94f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 10.0f, 176.0f)
                horizontalLineTo(49.37f)
                lineToRelative(35.32f, 35.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f)
                lineTo(165.66f, 153.0f)
                lineTo(184.0f, 171.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 195.31f, 176.0f)
                horizontalLineTo(240.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 136.0f)
                close()
                moveTo(160.0f, 24.0f)
                lineToRelative(12.69f, 12.69f)
                lineTo(49.37f, 160.0f)
                horizontalLineTo(24.46f)
                close()
            }
        }
        .build()
        return `_security-camera-fill`!!
    }

private var `_security-camera-fill`: ImageVector? = null
