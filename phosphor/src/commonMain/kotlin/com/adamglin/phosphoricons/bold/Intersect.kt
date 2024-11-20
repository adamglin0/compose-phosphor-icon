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

public val BoldGroup.Intersect: ImageVector
    get() {
        if (_intersect != null) {
            return _intersect!!
        }
        _intersect = Builder(name = "Intersect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 78.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 78.0f, 178.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 178.0f, 78.0f)
                close()
                moveTo(155.81f, 100.19f)
                arcToRelative(59.57f, 59.57f, 0.0f, false, true, -9.81f, 28.9f)
                lineTo(126.94f, 110.0f)
                arcTo(59.57f, 59.57f, 0.0f, false, true, 155.84f, 100.16f)
                close()
                moveTo(76.31f, 152.7f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 76.33f, -76.33f)
                arcTo(84.11f, 84.11f, 0.0f, false, false, 76.34f, 152.67f)
                close()
                moveTo(100.13f, 155.87f)
                arcToRelative(59.57f, 59.57f, 0.0f, false, true, 9.81f, -28.9f)
                lineTo(129.06f, 146.0f)
                arcTo(59.57f, 59.57f, 0.0f, false, true, 100.16f, 155.84f)
                close()
                moveTo(160.0f, 220.0f)
                arcToRelative(60.09f, 60.09f, 0.0f, false, true, -56.67f, -40.34f)
                arcToRelative(84.11f, 84.11f, 0.0f, false, false, 76.33f, -76.33f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 160.0f, 220.0f)
                close()
            }
        }
        .build()
        return _intersect!!
    }

private var _intersect: ImageVector? = null
