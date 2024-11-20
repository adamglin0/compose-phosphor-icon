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

public val BoldGroup.UserPlus: ImageVector
    get() {
        if (_userPlus != null) {
            return _userPlus!!
        }
        _userPlus = Builder(name = "UserPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 136.0f)
                close()
                moveTo(201.19f, 192.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -18.38f, 15.44f)
                curveTo(169.12f, 191.42f, 145.0f, 172.0f, 108.0f, 172.0f)
                curveToRelative(-28.89f, 0.0f, -55.46f, 12.68f, -74.81f, 35.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.38f, -15.44f)
                arcTo(124.08f, 124.08f, 0.0f, false, true, 63.5f, 156.53f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 89.0f, 0.0f)
                arcTo(124.0f, 124.0f, 0.0f, false, true, 201.19f, 192.28f)
                close()
                moveTo(108.0f, 148.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -48.0f, -48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 108.0f, 148.0f)
                close()
            }
        }
        .build()
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
