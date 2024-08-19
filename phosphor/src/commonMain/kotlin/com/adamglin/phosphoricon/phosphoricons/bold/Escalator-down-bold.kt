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

public val BoldGroup.`Escalator-down-bold`: ImageVector
    get() {
        if (`_escalator-down-bold` != null) {
            return `_escalator-down-bold`!!
        }
        `_escalator-down-bold` = Builder(name = "Escalator-down-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.51f, 88.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(188.0f, 75.0f)
                lineTo(188.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(212.0f, 75.0f)
                lineToRelative(3.51f, -3.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                close()
                moveTo(244.0f, 160.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(168.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.82f, -3.86f)
                lineTo(66.75f, 116.0f)
                lineTo(32.0f, 116.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 12.0f, 96.0f)
                lineTo(12.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 32.0f, 36.0f)
                lineTo(88.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.82f, 3.86f)
                lineTo(189.25f, 140.0f)
                lineTo(224.0f, 140.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 244.0f, 160.0f)
                close()
                moveTo(220.0f, 164.0f)
                lineTo(184.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.82f, -3.86f)
                lineTo(82.75f, 60.0f)
                lineTo(36.0f, 60.0f)
                lineTo(36.0f, 92.0f)
                lineTo(72.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.82f, 3.86f)
                lineTo(173.25f, 196.0f)
                lineTo(220.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_escalator-down-bold`!!
    }

private var `_escalator-down-bold`: ImageVector? = null
