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

public val BoldGroup.`Number-square-three-bold`: ImageVector
    get() {
        if (`_number-square-three-bold` != null) {
            return `_number-square-three-bold`!!
        }
        `_number-square-three-bold` = Builder(name = "Number-square-three-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(204.0f, 52.0f)
                close()
                moveTo(92.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.83f, 18.88f)
                lineToRelative(-18.34f, 26.2f)
                arcTo(40.0f, 40.0f, 0.0f, true, true, 95.43f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.14f, -16.79f)
                arcTo(16.0f, 16.0f, 0.0f, true, false, 124.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.83f, -18.88f)
                lineTo(129.0f, 92.0f)
                lineTo(104.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_number-square-three-bold`!!
    }

private var `_number-square-three-bold`: ImageVector? = null
