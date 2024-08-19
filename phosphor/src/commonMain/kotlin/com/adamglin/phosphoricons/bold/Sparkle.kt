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

public val BoldGroup.Sparkle: ImageVector
    get() {
        if (_sparkle != null) {
            return _sparkle!!
        }
        _sparkle = Builder(name = "Sparkle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.0f, 125.31f)
                lineToRelative(-49.88f, -18.39f)
                lineTo(130.69f, 57.0f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, -37.38f, 0.0f)
                lineTo(74.92f, 106.92f)
                lineTo(25.0f, 125.31f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, 0.0f, 37.38f)
                lineToRelative(49.88f, 18.39f)
                lineTo(93.31f, 231.0f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, 37.38f, 0.0f)
                lineToRelative(18.39f, -49.88f)
                lineTo(199.0f, 162.69f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, 0.0f, -37.38f)
                close()
                moveTo(135.62f, 160.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.11f, 7.11f)
                lineTo(112.0f, 212.28f)
                lineToRelative(-16.47f, -44.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.11f, -7.11f)
                lineTo(43.72f, 144.0f)
                lineToRelative(44.7f, -16.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.11f, -7.11f)
                lineTo(112.0f, 75.72f)
                lineToRelative(16.47f, 44.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.11f, 7.11f)
                lineTo(180.28f, 144.0f)
                close()
                moveTo(140.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(164.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(188.0f, 28.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(188.0f, 52.0f)
                lineTo(188.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(164.0f, 52.0f)
                lineTo(152.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 40.0f)
                close()
                moveTo(252.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(212.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 88.0f)
                close()
            }
        }
        .build()
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
