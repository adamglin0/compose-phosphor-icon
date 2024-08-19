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

public val ThinGroup.Numbercircleseven: ImageVector
    get() {
        if (_numbercircleseven != null) {
            return _numbercircleseven!!
        }
        _numbercircleseven = Builder(name = "Numbercircleseven", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(155.28f, 85.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.48f, 3.66f)
                lineToRelative(-32.0f, 88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 120.0f, 180.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, true, -1.37f, -0.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.39f, -5.13f)
                lineTo(146.29f, 92.0f)
                lineTo(104.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 155.28f, 85.71f)
                close()
            }
        }
        .build()
        return _numbercircleseven!!
    }

private var _numbercircleseven: ImageVector? = null
