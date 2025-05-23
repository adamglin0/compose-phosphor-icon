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

public val BoldGroup.Ranking: ImageVector
    get() {
        if (_ranking != null) {
            return _ranking!!
        }
        _ranking = Builder(name = "Ranking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.62f, 103.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.59f, -15.17f)
                lineToRelative(12.0f, -4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(120.0f, 112.0f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 108.62f, 103.79f)
                close()
                moveTo(252.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(16.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(20.0f, 104.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 84.0f)
                lineTo(76.0f, 84.0f)
                lineTo(76.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 96.0f, 36.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(68.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 208.0f)
                close()
                moveTo(180.0f, 148.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(32.0f)
                lineTo(212.0f, 148.0f)
                close()
                moveTo(100.0f, 196.0f)
                horizontalLineToRelative(56.0f)
                lineTo(156.0f, 60.0f)
                lineTo(100.0f, 60.0f)
                close()
                moveTo(44.0f, 196.0f)
                lineTo(76.0f, 196.0f)
                lineTo(76.0f, 108.0f)
                lineTo(44.0f, 108.0f)
                close()
            }
        }
        .build()
        return _ranking!!
    }

private var _ranking: ImageVector? = null
