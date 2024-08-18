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

public val FillGroup.`Play-circle-fill`: ImageVector
    get() {
        if (`_play-circle-fill` != null) {
            return `_play-circle-fill`!!
        }
        `_play-circle-fill` = Builder(name = "Play-circle-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(168.55f, 134.58f)
                lineTo(116.55f, 170.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 164.0f)
                lineTo(104.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.55f, -6.58f)
                lineToRelative(52.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 13.16f)
                close()
            }
        }
        .build()
        return `_play-circle-fill`!!
    }

private var `_play-circle-fill`: ImageVector? = null
