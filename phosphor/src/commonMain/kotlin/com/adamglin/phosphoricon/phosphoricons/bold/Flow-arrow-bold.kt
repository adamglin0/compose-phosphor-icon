package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Flow-arrow-bold`: ImageVector
    get() {
        if (`_flow-arrow-bold` != null) {
            return `_flow-arrow-bold`!!
        }
        `_flow-arrow-bold` = Builder(name = "Flow-arrow-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.49f, 71.51f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(211.0f, 68.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-52.0f, 0.0f, -64.8f, 30.71f, -75.08f, 55.38f)
                curveToRelative(-8.82f, 21.17f, -15.45f, 37.05f, -42.75f, 40.09f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.28f, 24.08f)
                curveToRelative(43.34f, -3.87f, 55.07f, -32.0f, 64.63f, -54.93f)
                curveTo(164.9f, 109.0f, 172.0f, 92.0f, 208.0f, 92.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-11.52f, 11.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 248.49f, 71.51f)
                close()
                moveTo(48.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_flow-arrow-bold`!!
    }

private var `_flow-arrow-bold`: ImageVector? = null
