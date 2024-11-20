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

public val LightGroup.Cactus: ImageVector
    get() {
        if (_cactus != null) {
            return _cactus!!
        }
        _cactus = Builder(name = "Cactus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 210.0f)
                horizontalLineTo(166.0f)
                verticalLineTo(182.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(66.08f, 66.08f, 0.0f, false, false, 66.0f, -66.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -52.0f, 0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(56.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                verticalLineTo(90.0f)
                horizontalLineTo(84.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 70.0f, 76.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -52.0f, 0.0f)
                arcToRelative(66.08f, 66.08f, 0.0f, false, false, 66.0f, 66.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(68.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(96.0f, 130.0f)
                horizontalLineTo(84.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, true, 30.0f, 76.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, 26.0f)
                horizontalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(56.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, -26.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, true, -54.0f, 54.0f)
                horizontalLineTo(160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(34.0f)
                horizontalLineTo(102.0f)
                verticalLineTo(136.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 130.0f)
                close()
            }
        }
        .build()
        return _cactus!!
    }

private var _cactus: ImageVector? = null
