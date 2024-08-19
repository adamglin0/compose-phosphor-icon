package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Baseballhelmet: ImageVector
    get() {
        if (_baseballhelmet != null) {
            return _baseballhelmet!!
        }
        _baseballhelmet = Builder(name = "Baseballhelmet", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 88.0f, 128.0f)
                close()
                moveTo(88.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 168.0f)
                close()
                moveTo(248.0f, 120.0f)
                lineTo(223.7f, 120.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 16.0f, 128.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, 72.0f, 72.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, 72.0f, -72.0f)
                lineTo(200.0f, 136.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(184.0f, 152.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, -50.46f, 55.72f)
                arcTo(71.87f, 71.87f, 0.0f, false, false, 160.0f, 152.0f)
                lineTo(160.0f, 136.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(152.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -112.0f, 0.0f)
                lineTo(32.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 175.64f, -8.0f)
                close()
            }
        }
        .build()
        return _baseballhelmet!!
    }

private var _baseballhelmet: ImageVector? = null
