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

public val FillGroup.`Shuffle-simple-fill`: ImageVector
    get() {
        if (`_shuffle-simple-fill` != null) {
            return `_shuffle-simple-fill`!!
        }
        `_shuffle-simple-fill` = Builder(name = "Shuffle-simple-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.66f, 5.66f)
                lineTo(188.0f, 79.31f)
                lineTo(156.28f, 111.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 145.0f, 99.72f)
                lineTo(176.69f, 68.0f)
                lineTo(162.34f, 53.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 40.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f)
                close()
                moveTo(211.06f, 160.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(188.0f, 176.69f)
                lineTo(53.66f, 42.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 53.66f)
                lineTo(176.69f, 188.0f)
                lineToRelative(-14.35f, 14.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 216.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 211.06f, 160.61f)
                close()
                moveTo(99.72f, 145.0f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(111.0f, 156.28f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 99.72f, 145.0f)
                close()
            }
        }
        .build()
        return `_shuffle-simple-fill`!!
    }

private var `_shuffle-simple-fill`: ImageVector? = null
