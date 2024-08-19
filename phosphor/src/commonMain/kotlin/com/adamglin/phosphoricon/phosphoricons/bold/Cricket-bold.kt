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

public val BoldGroup.`Cricket-bold`: ImageVector
    get() {
        if (`_cricket-bold` != null) {
            return `_cricket-bold`!!
        }
        `_cricket-bold` = Builder(name = "Cricket-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.15f, 78.54f)
                lineTo(193.46f, 25.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(57.86f, 133.17f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f)
                lineToRelative(17.86f, 17.86f)
                lineToRelative(-44.2f, 44.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(44.2f, -44.21f)
                lineToRelative(17.86f, 17.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f)
                lineTo(246.15f, 106.82f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 246.15f, 78.54f)
                close()
                moveTo(124.69f, 194.34f)
                lineToRelative(-15.0f, -15.0f)
                lineToRelative(26.83f, -26.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(92.69f, 162.34f)
                lineToRelative(-15.0f, -15.0f)
                lineTo(109.0f, 116.0f)
                horizontalLineToRelative(47.0f)
                verticalLineToRelative(47.0f)
                close()
                moveTo(180.0f, 139.0f)
                lineTo(180.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(133.0f, 92.0f)
                lineToRelative(46.34f, -46.34f)
                lineToRelative(47.0f, 47.0f)
                close()
                moveTo(60.0f, 92.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 28.0f, 60.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 60.0f, 92.0f)
                close()
                moveTo(60.0f, 52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 60.0f, 52.0f)
                close()
            }
        }
        .build()
        return `_cricket-bold`!!
    }

private var `_cricket-bold`: ImageVector? = null
