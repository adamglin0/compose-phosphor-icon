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

public val FillGroup.`Money-wavy-fill`: ImageVector
    get() {
        if (`_money-wavy-fill` != null) {
            return `_money-wavy-fill`!!
        }
        `_money-wavy-fill` = Builder(name = "Money-wavy-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.24f, 60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.75f, -0.4f)
                curveToRelative(-42.93f, 21.0f, -73.59f, 11.16f, -106.0f, 0.78f)
                curveTo(96.4f, 49.53f, 61.2f, 38.28f, 12.49f, 62.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 69.24f)
                lineTo(8.0f, 189.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.51f, 7.19f)
                curveToRelative(42.93f, -21.0f, 73.59f, -11.16f, 106.05f, -0.78f)
                curveToRelative(19.24f, 6.15f, 38.84f, 12.42f, 61.0f, 12.42f)
                curveToRelative(17.09f, 0.0f, 35.73f, -3.72f, 56.91f, -14.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.49f, -7.18f)
                lineTo(247.96f, 66.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 244.24f, 60.0f)
                close()
                moveTo(48.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 160.0f)
                close()
                moveTo(224.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(208.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_money-wavy-fill`!!
    }

private var `_money-wavy-fill`: ImageVector? = null
