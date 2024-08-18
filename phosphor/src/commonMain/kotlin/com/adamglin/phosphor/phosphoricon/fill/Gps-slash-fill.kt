package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Gps-slash-fill`: ImageVector
    get() {
        if (`_gps-slash-fill` != null) {
            return `_gps-slash-fill`!!
        }
        `_gps-slash-fill` = Builder(name = "Gps-slash-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 136.0f)
                horizontalLineTo(215.63f)
                arcToRelative(87.21f, 87.21f, 0.0f, false, true, -10.13f, 33.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.5f, 0.81f)
                lineTo(92.51f, 53.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.4f, -6.38f)
                arcTo(87.0f, 87.0f, 0.0f, false, true, 120.0f, 40.37f)
                verticalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, -8.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 136.0f, 16.27f)
                verticalLineToRelative(24.1f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 215.63f, 120.0f)
                horizontalLineToRelative(24.1f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 8.25f, 7.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 136.0f)
                close()
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineToRelative(21.09f, 23.2f)
                arcTo(87.63f, 87.63f, 0.0f, false, false, 40.37f, 120.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(40.37f)
                arcTo(88.13f, 88.13f, 0.0f, false, false, 120.0f, 215.63f)
                verticalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(215.63f)
                arcToRelative(87.51f, 87.51f, 0.0f, false, false, 45.0f, -17.43f)
                lineToRelative(21.08f, 23.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
            }
        }
        .build()
        return `_gps-slash-fill`!!
    }

private var `_gps-slash-fill`: ImageVector? = null
