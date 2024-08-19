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

public val ThinGroup.Angularlogo: ImageVector
    get() {
        if (_angularlogo != null) {
            return _angularlogo!!
        }
        _angularlogo = Builder(name = "Angularlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.54f, 68.31f)
                lineToRelative(-96.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.08f, 0.0f)
                lineToRelative(-96.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 72.53f)
                lineToRelative(16.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.17f, 3.05f)
                lineToRelative(80.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f)
                lineToRelative(80.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.17f, -3.05f)
                lineToRelative(16.0f, -120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 225.54f, 68.31f)
                close()
                moveTo(204.32f, 189.37f)
                lineTo(128.0f, 227.53f)
                lineTo(51.68f, 189.37f)
                lineTo(36.37f, 74.51f)
                lineTo(128.0f, 36.33f)
                lineToRelative(91.63f, 38.18f)
                close()
                moveTo(124.5f, 86.06f)
                lineToRelative(-40.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.0f, 3.88f)
                lineTo(103.69f, 140.0f)
                horizontalLineToRelative(48.62f)
                lineToRelative(12.19f, 21.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.0f, -3.88f)
                lineToRelative(-40.0f, -72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.0f, 0.0f)
                close()
                moveTo(147.87f, 132.0f)
                horizontalLineTo(108.13f)
                lineTo(128.0f, 96.24f)
                close()
            }
        }
        .build()
        return _angularlogo!!
    }

private var _angularlogo: ImageVector? = null
