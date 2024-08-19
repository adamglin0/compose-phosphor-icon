package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 124.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, false, -32.0f, -48.0f)
                lineTo(212.0f, 72.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -84.0f, -18.3f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 44.0f, 72.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 96.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 84.0f, 18.3f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 212.0f, 176.0f)
                verticalLineToRelative(-4.0f)
                arcTo(52.07f, 52.07f, 0.0f, false, false, 244.0f, 124.0f)
                close()
                moveTo(88.0f, 212.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                verticalLineToRelative(-1.41f)
                arcTo(52.13f, 52.13f, 0.0f, false, false, 64.0f, 176.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(64.0f, 168.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 49.33f, 82.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 52.0f, 78.73f)
                lineTo(52.0f, 72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                verticalLineToRelative(78.75f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 88.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
                moveTo(192.0f, 168.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(52.13f, 52.13f, 0.0f, false, false, 12.0f, -1.41f)
                lineTo(204.0f, 176.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -36.0f, 18.75f)
                lineTo(132.0f, 72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                verticalLineToRelative(6.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.67f, 3.77f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 192.0f, 168.0f)
                close()
                moveTo(204.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(164.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 112.0f)
                close()
                moveTo(92.0f, 84.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(56.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(4.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 84.0f, 84.0f)
                lineTo(84.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
