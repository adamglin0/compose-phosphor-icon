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

public val FillGroup.`Heart-fill`: ImageVector
    get() {
        if (`_heart-fill` != null) {
            return `_heart-fill`!!
        }
        `_heart-fill` = Builder(name = "Heart-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 102.0f)
                curveToRelative(0.0f, 70.0f, -103.79f, 126.66f, -108.21f, 129.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.58f, 0.0f)
                curveTo(119.79f, 228.66f, 16.0f, 172.0f, 16.0f, 102.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, true, 78.0f, 40.0f)
                curveToRelative(20.65f, 0.0f, 38.73f, 8.88f, 50.0f, 23.89f)
                curveTo(139.27f, 48.88f, 157.35f, 40.0f, 178.0f, 40.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, true, 240.0f, 102.0f)
                close()
            }
        }
        .build()
        return `_heart-fill`!!
    }

private var `_heart-fill`: ImageVector? = null
