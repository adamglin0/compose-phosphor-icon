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

public val FillGroup.`Line-segments-fill`: ImageVector
    get() {
        if (`_line-segments-fill` != null) {
            return `_line-segments-fill`!!
        }
        `_line-segments-fill` = Builder(name = "Line-segments-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.81f, 75.79f)
                arcTo(27.91f, 27.91f, 0.0f, false, true, 216.0f, 84.0f)
                arcToRelative(28.49f, 28.49f, 0.0f, false, true, -5.67f, -0.58f)
                lineToRelative(-30.57f, 56.77f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -44.43f, 6.49f)
                lineToRelative(-26.06f, -26.06f)
                arcTo(28.07f, 28.07f, 0.0f, false, true, 96.0f, 124.0f)
                arcToRelative(28.41f, 28.41f, 0.0f, false, true, -5.67f, -0.58f)
                lineTo(59.76f, 180.18f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -39.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 25.47f, -7.61f)
                lineToRelative(30.57f, -56.77f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(28.05f, 28.05f, 0.0f, false, true, 0.0f, -39.61f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 44.43f, 33.12f)
                lineToRelative(26.06f, 26.06f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 19.0f, -2.77f)
                lineToRelative(30.57f, -56.77f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -39.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 39.6f, 39.6f)
                close()
            }
        }
        .build()
        return `_line-segments-fill`!!
    }

private var `_line-segments-fill`: ImageVector? = null
