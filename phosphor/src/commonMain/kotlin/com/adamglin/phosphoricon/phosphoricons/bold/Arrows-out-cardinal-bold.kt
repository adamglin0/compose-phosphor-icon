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

public val BoldGroup.`Arrows-out-cardinal-bold`: ImageVector
    get() {
        if (`_arrows-out-cardinal-bold` != null) {
            return `_arrows-out-cardinal-bold`!!
        }
        `_arrows-out-cardinal-bold` = Builder(name = "Arrows-out-cardinal-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.51f, 64.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(140.0f, 53.0f)
                lineTo(140.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 53.0f)
                lineTo(104.49f, 64.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 87.51f, 64.49f)
                close()
                moveTo(151.51f, 191.49f)
                lineTo(140.0f, 203.0f)
                lineTo(140.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(43.0f)
                lineToRelative(-11.51f, -11.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                close()
                moveTo(240.51f, 119.49f)
                lineTo(208.51f, 87.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(203.0f, 116.0f)
                lineTo(160.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(43.0f)
                lineToRelative(-11.52f, 11.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.49f, 119.51f)
                close()
                moveTo(53.0f, 140.0f)
                lineTo(96.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(53.0f, 116.0f)
                lineToRelative(11.52f, -11.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f)
                close()
            }
        }
        .build()
        return `_arrows-out-cardinal-bold`!!
    }

private var `_arrows-out-cardinal-bold`: ImageVector? = null
