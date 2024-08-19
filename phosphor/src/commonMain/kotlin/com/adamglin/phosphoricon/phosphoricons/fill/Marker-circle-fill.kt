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

public val FillGroup.`Marker-circle-fill`: ImageVector
    get() {
        if (`_marker-circle-fill` != null) {
            return `_marker-circle-fill`!!
        }
        `_marker-circle-fill` = Builder(name = "Marker-circle-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(168.0f, 206.37f)
                arcToRelative(87.89f, 87.89f, 0.0f, false, true, -80.0f, 0.0f)
                lineTo(88.0f, 176.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(104.0f, 160.0f)
                lineTo(104.0f, 144.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(184.0f, 195.83f)
                lineTo(184.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(168.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.61f, -15.8f)
                lineTo(143.66f, 76.74f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -31.32f, 0.0f)
                lineTo(101.61f, 128.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 144.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(19.83f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 112.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_marker-circle-fill`!!
    }

private var `_marker-circle-fill`: ImageVector? = null
