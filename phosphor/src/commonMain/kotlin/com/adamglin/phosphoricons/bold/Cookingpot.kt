package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) {
            return _cookingPot!!
        }
        _cookingPot = Builder(name = "CookingPot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.76f, 93.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 237.0f, 90.24f)
                lineToRelative(-9.0f, 6.44f)
                lineTo(228.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(40.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.0f)
                lineTo(28.0f, 96.68f)
                lineToRelative(-9.0f, -6.44f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 5.0f, 109.76f)
                lineToRelative(23.0f, 16.42f)
                lineTo(28.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                lineTo(192.0f, 220.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(228.0f, 126.18f)
                lineToRelative(23.0f, -16.42f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 253.76f, 93.0f)
                close()
                moveTo(204.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(64.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(52.0f, 92.0f)
                lineTo(204.0f, 92.0f)
                close()
                moveTo(76.0f, 40.0f)
                lineTo(76.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(100.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(116.0f, 40.0f)
                lineTo(116.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(140.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(156.0f, 40.0f)
                lineTo(156.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(180.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
