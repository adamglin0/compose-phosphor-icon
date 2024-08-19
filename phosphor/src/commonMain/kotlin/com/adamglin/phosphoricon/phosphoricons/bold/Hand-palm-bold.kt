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

public val BoldGroup.`Hand-palm-bold`: ImageVector
    get() {
        if (`_hand-palm-bold` != null) {
            return `_hand-palm-bold`!!
        }
        `_hand-palm-bold` = Builder(name = "Hand-palm-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 84.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -8.0f, 1.0f)
                lineTo(180.0f, 60.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -43.21f, -30.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 76.0f, 44.0f)
                verticalLineToRelative(1.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 36.0f, 76.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                lineTo(220.0f, 116.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 188.0f, 84.0f)
                close()
                moveTo(196.0f, 152.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, -136.0f, 0.0f)
                lineTo(60.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(100.0f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(65.4f)
                arcTo(52.09f, 52.09f, 0.0f, false, false, 116.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(180.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_hand-palm-bold`!!
    }

private var `_hand-palm-bold`: ImageVector? = null
