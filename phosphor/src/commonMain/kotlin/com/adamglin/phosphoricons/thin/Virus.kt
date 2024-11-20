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

public val ThinGroup.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(name = "Virus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 108.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 132.0f, 108.0f)
                close()
                moveTo(108.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 124.0f)
                close()
                moveTo(188.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 128.0f)
                close()
                moveTo(140.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 176.0f)
                close()
                moveTo(240.0f, 124.0f)
                lineTo(219.91f, 124.0f)
                arcToRelative(91.64f, 91.64f, 0.0f, false, false, -24.12f, -58.13f)
                lineToRelative(15.0f, -15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineToRelative(-15.0f, 15.0f)
                arcTo(91.64f, 91.64f, 0.0f, false, false, 132.0f, 36.09f)
                lineTo(132.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 36.09f)
                arcTo(91.64f, 91.64f, 0.0f, false, false, 65.87f, 60.21f)
                lineToRelative(-15.0f, -15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineToRelative(15.0f, 15.0f)
                arcTo(91.64f, 91.64f, 0.0f, false, false, 36.09f, 124.0f)
                lineTo(16.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(36.09f, 132.0f)
                arcToRelative(91.64f, 91.64f, 0.0f, false, false, 24.12f, 58.13f)
                lineToRelative(-15.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(15.0f, -15.0f)
                arcTo(91.64f, 91.64f, 0.0f, false, false, 124.0f, 219.91f)
                lineTo(124.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 219.91f)
                arcToRelative(91.64f, 91.64f, 0.0f, false, false, 58.13f, -24.12f)
                lineToRelative(15.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineToRelative(-15.0f, -15.0f)
                arcTo(91.64f, 91.64f, 0.0f, false, false, 219.91f, 132.0f)
                lineTo(240.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
