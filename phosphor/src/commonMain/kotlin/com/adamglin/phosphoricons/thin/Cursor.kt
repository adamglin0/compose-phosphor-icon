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

public val ThinGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.17f, 135.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -6.46f)
                lineToRelative(46.31f, -17.79f)
                lineToRelative(0.16f, -0.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.05f, -22.33f)
                lineTo(51.67f, 36.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.6f, 51.67f)
                lineTo(88.87f, 211.76f)
                arcTo(11.86f, 11.86f, 0.0f, false, false, 99.67f, 220.0f)
                horizontalLineToRelative(0.58f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, false, 11.0f, -7.19f)
                lineToRelative(0.06f, -0.16f)
                lineToRelative(17.79f, -46.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.47f, -1.17f)
                lineToRelative(51.31f, 51.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(12.69f, -12.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(210.83f, 198.14f)
                lineTo(198.14f, 210.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-51.31f, -51.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, -3.52f)
                arcToRelative(12.13f, 12.13f, 0.0f, false, false, -2.24f, 0.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.77f, 7.0f)
                lineToRelative(-0.06f, 0.16f)
                lineToRelative(-17.79f, 46.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.36f, -0.42f)
                lineTo(44.2f, 49.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, -5.0f)
                lineTo(209.27f, 96.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.42f, 7.36f)
                lineToRelative(-46.31f, 17.78f)
                lineToRelative(-0.16f, 0.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.71f, 19.49f)
                lineToRelative(51.32f, 51.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 210.83f, 198.14f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
