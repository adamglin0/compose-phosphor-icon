package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Ranking: ImageVector
    get() {
        if (_ranking != null) {
            return _ranking!!
        }
        _ranking = Builder(name = "Ranking", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.41f, 102.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.06f, -10.12f)
                lineToRelative(12.0f, -4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(124.0f, 107.1f)
                lineToRelative(-1.47f, 0.49f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.41f, 102.53f)
                close()
                moveTo(248.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(16.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 88.0f)
                lineTo(80.0f, 88.0f)
                lineTo(80.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 40.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 208.0f)
                close()
                moveTo(176.0f, 144.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(40.0f)
                lineTo(216.0f, 144.0f)
                close()
                moveTo(96.0f, 200.0f)
                horizontalLineToRelative(64.0f)
                lineTo(160.0f, 56.0f)
                lineTo(96.0f, 56.0f)
                close()
                moveTo(40.0f, 200.0f)
                lineTo(80.0f, 200.0f)
                lineTo(80.0f, 104.0f)
                lineTo(40.0f, 104.0f)
                close()
            }
        }
        .build()
        return _ranking!!
    }

private var _ranking: ImageVector? = null
