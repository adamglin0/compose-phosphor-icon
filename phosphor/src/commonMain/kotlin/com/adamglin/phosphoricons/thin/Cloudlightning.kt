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

public val ThinGroup.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) {
            return _cloudLightning!!
        }
        _cloudLightning = Builder(name = "CloudLightning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 20.0f)
                arcTo(72.19f, 72.19f, 0.0f, false, false, 87.51f, 69.39f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 76.0f, 164.0f)
                horizontalLineToRelative(44.94f)
                lineToRelative(-20.37f, 33.94f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 204.0f)
                horizontalLineToRelative(32.94f)
                lineToRelative(-20.37f, 33.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.86f, 4.12f)
                lineToRelative(24.0f, -40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 144.0f, 196.0f)
                lineTo(111.06f, 196.0f)
                lineToRelative(19.2f, -32.0f)
                lineTo(156.0f, 164.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f)
                close()
                moveTo(156.0f, 156.0f)
                lineTo(76.0f, 156.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 9.43f, -78.88f)
                arcTo(71.63f, 71.63f, 0.0f, false, false, 84.0f, 87.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.46f)
                arcTo(64.06f, 64.06f, 0.0f, true, true, 156.0f, 156.0f)
                close()
            }
        }
        .build()
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
