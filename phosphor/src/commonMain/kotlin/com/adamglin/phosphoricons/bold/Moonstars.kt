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

public val BoldGroup.MoonStars: ImageVector
    get() {
        if (_moonStars != null) {
            return _moonStars!!
        }
        _moonStars = Builder(name = "MoonStars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(220.0f, 108.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(196.0f, 108.0f)
                lineTo(184.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(12.0f)
                lineTo(196.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(220.0f, 84.0f)
                horizontalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 96.0f)
                close()
                moveTo(144.0f, 60.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(172.0f, 60.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(172.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(219.81f, 150.38f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 222.0f, 162.3f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 93.7f, 34.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.89f, 13.6f)
                arcTo(85.12f, 85.12f, 0.0f, false, false, 108.0f, 64.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, 84.0f)
                arcToRelative(85.22f, 85.22f, 0.0f, false, false, 16.37f, -1.59f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 219.81f, 150.38f)
                close()
                moveTo(190.0f, 172.0f)
                arcTo(108.13f, 108.13f, 0.0f, false, true, 84.0f, 66.0f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 190.0f, 172.0f)
                close()
            }
        }
        .build()
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
