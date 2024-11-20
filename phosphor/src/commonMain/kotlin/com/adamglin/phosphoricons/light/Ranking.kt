package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Ranking: ImageVector
    get() {
        if (_ranking != null) {
            return _ranking!!
        }
        _ranking = Builder(name = "Ranking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.31f, 101.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.79f, -7.59f)
                lineToRelative(12.0f, -4.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 138.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(126.0f, 104.32f)
                lineToRelative(-4.1f, 1.37f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 114.31f, 101.9f)
                close()
                moveTo(246.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(16.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(26.0f, 202.0f)
                lineTo(26.0f, 104.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 90.0f)
                lineTo(82.0f, 90.0f)
                lineTo(82.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 96.0f, 42.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(74.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(58.0f)
                horizontalLineToRelative(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 208.0f)
                close()
                moveTo(174.0f, 142.0f)
                verticalLineToRelative(60.0f)
                horizontalLineToRelative(44.0f)
                lineTo(218.0f, 144.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(94.0f, 202.0f)
                horizontalLineToRelative(68.0f)
                lineTo(162.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(96.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                close()
                moveTo(38.0f, 202.0f)
                lineTo(82.0f, 202.0f)
                lineTo(82.0f, 102.0f)
                lineTo(40.0f, 102.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _ranking!!
    }

private var _ranking: ImageVector? = null
