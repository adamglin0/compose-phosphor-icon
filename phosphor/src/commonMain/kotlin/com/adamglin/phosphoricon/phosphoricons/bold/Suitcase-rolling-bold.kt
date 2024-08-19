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

public val BoldGroup.`Suitcase-rolling-bold`: ImageVector
    get() {
        if (`_suitcase-rolling-bold` != null) {
            return `_suitcase-rolling-bold`!!
        }
        `_suitcase-rolling-bold` = Builder(name = "Suitcase-rolling-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(92.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(140.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(164.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                close()
                moveTo(212.0f, 64.0f)
                lineTo(212.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(180.0f, 228.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(156.0f, 228.0f)
                lineTo(100.0f, 228.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(76.0f, 228.0f)
                lineTo(64.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(44.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 64.0f, 44.0f)
                lineTo(84.0f, 44.0f)
                lineTo(84.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 112.0f, 0.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                lineTo(172.0f, 44.0f)
                horizontalLineToRelative(20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 64.0f)
                close()
                moveTo(108.0f, 44.0f)
                horizontalLineToRelative(40.0f)
                lineTo(148.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(112.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
                moveTo(188.0f, 68.0f)
                lineTo(68.0f, 68.0f)
                lineTo(68.0f, 204.0f)
                lineTo(188.0f, 204.0f)
                close()
            }
        }
        .build()
        return `_suitcase-rolling-bold`!!
    }

private var `_suitcase-rolling-bold`: ImageVector? = null
