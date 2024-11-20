package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.UserPlus: ImageVector
    get() {
        if (_userPlus != null) {
            return _userPlus!!
        }
        _userPlus = Builder(name = "UserPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(230.0f, 142.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 142.0f)
                lineTo(200.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(218.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 254.0f, 136.0f)
                close()
                moveTo(196.59f, 196.14f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.18f, 7.72f)
                curveTo(166.9f, 179.45f, 138.69f, 166.0f, 108.0f, 166.0f)
                reflectiveCurveToRelative(-58.89f, 13.45f, -79.41f, 37.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.18f, -7.72f)
                curveTo(35.14f, 177.41f, 55.0f, 164.48f, 77.0f, 158.25f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 62.0f, 0.0f)
                curveTo(161.0f, 164.48f, 180.86f, 177.41f, 196.59f, 196.14f)
                close()
                moveTo(108.0f, 154.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, -54.0f, -54.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 108.0f, 154.0f)
                close()
            }
        }
        .build()
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
