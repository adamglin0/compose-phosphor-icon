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

public val FillGroup.`Read-cv-logo-fill`: ImageVector
    get() {
        if (`_read-cv-logo-fill` != null) {
            return `_read-cv-logo-fill`!!
        }
        `_read-cv-logo-fill` = Builder(name = "Read-cv-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.78f, 39.25f)
                lineToRelative(-130.25f, -23.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 62.0f, 29.23f)
                lineToRelative(-29.75f, 169.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.0f, 18.53f)
                lineToRelative(130.25f, 23.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.54f, -13.0f)
                lineToRelative(29.75f, -169.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 210.78f, 39.25f)
                close()
                moveTo(135.5f, 131.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.87f, 6.61f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, true, -1.4f, -0.12f)
                lineToRelative(-41.5f, -7.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 87.52f, 115.0f)
                lineTo(129.0f, 122.29f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 135.5f, 131.56f)
                close()
                moveTo(182.5f, 107.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.86f, 6.61f)
                arcToRelative(7.55f, 7.55f, 0.0f, false, true, -1.41f, -0.13f)
                lineToRelative(-83.0f, -14.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.79f, -15.76f)
                lineToRelative(83.0f, 14.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 182.53f, 107.38f)
                close()
                moveTo(188.05f, 75.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.87f, 6.61f)
                arcToRelative(8.36f, 8.36f, 0.0f, false, true, -1.4f, -0.12f)
                lineToRelative(-83.0f, -14.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 2.78f, -15.75f)
                lineToRelative(83.0f, 14.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.08f, 75.86f)
                close()
            }
        }
        .build()
        return `_read-cv-logo-fill`!!
    }

private var `_read-cv-logo-fill`: ImageVector? = null
