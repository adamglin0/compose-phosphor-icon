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

public val ThinGroup.Cloudwarning: ImageVector
    get() {
        if (_cloudwarning != null) {
            return _cloudwarning!!
        }
        _cloudwarning = Builder(name = "Cloudwarning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 44.0f)
                arcTo(84.11f, 84.11f, 0.0f, false, false, 83.59f, 93.12f)
                arcTo(60.71f, 60.71f, 0.0f, false, false, 72.0f, 92.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, 120.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 0.0f, -168.0f)
                close()
                moveTo(160.0f, 204.0f)
                lineTo(72.0f, 204.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 8.55f, -103.3f)
                arcTo(83.66f, 83.66f, 0.0f, false, false, 76.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, 76.0f)
                close()
                moveTo(156.0f, 128.0f)
                lineTo(156.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(168.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 164.0f)
                close()
            }
        }
        .build()
        return _cloudwarning!!
    }

private var _cloudwarning: ImageVector? = null
