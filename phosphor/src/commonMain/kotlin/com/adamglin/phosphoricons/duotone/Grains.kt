package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Grains: ImageVector
    get() {
        if (_grains != null) {
            return _grains!!
        }
        _grains = Builder(name = "Grains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 64.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -80.0f, 80.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -80.0f, -80.0f)
                verticalLineTo(64.0f)
                arcToRelative(79.67f, 79.67f, 0.0f, false, true, 36.05f, 8.59f)
                verticalLineToRelative(0.0f)
                curveTo(95.62f, 40.19f, 128.0f, 24.0f, 128.0f, 24.0f)
                reflectiveCurveTo(160.39f, 40.19f, 172.0f, 72.58f)
                horizontalLineToRelative(0.0f)
                arcTo(79.6f, 79.6f, 0.0f, false, true, 208.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 56.0f)
                arcToRelative(87.53f, 87.53f, 0.0f, false, false, -31.85f, 6.0f)
                curveToRelative(-14.32f, -29.7f, -43.25f, -44.46f, -44.57f, -45.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                curveToRelative(-1.33f, 0.67f, -30.25f, 15.43f, -44.57f, 45.13f)
                arcTo(87.53f, 87.53f, 0.0f, false, false, 48.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                lineTo(216.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 56.0f)
                close()
                moveTo(120.0f, 215.56f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 56.0f, 144.0f)
                lineTo(56.0f, 128.44f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 200.0f)
                close()
                moveTo(120.0f, 149.46f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -64.0f, -37.09f)
                lineTo(56.0f, 72.44f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 144.0f)
                close()
                moveTo(94.15f, 69.11f)
                curveTo(103.37f, 49.89f, 120.58f, 37.76f, 128.0f, 33.2f)
                curveToRelative(7.44f, 4.54f, 24.6f, 16.6f, 33.84f, 35.91f)
                arcTo(88.51f, 88.51f, 0.0f, false, false, 128.0f, 107.36f)
                arcTo(88.51f, 88.51f, 0.0f, false, false, 94.15f, 69.11f)
                close()
                moveTo(200.0f, 144.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -64.0f, 71.56f)
                lineTo(136.0f, 200.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 64.0f, -71.56f)
                close()
                moveTo(200.0f, 112.37f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -64.0f, 37.09f)
                lineTo(136.0f, 144.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 64.0f, -71.56f)
                close()
            }
        }
        .build()
        return _grains!!
    }

private var _grains: ImageVector? = null
