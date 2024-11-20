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

public val DuotoneGroup.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) {
            return _behanceLogo!!
        }
        _behanceLogo = Builder(name = "BehanceLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 152.0f)
                horizontalLineTo(160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f)
                close()
                moveTo(94.0f, 124.0f)
                horizontalLineTo(90.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -60.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(94.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 0.0f, -68.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(168.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 80.0f)
                close()
                moveTo(136.0f, 158.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(24.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(90.0f, 56.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 25.65f, 66.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 136.0f, 158.0f)
                close()
                moveTo(40.0f, 116.0f)
                lineTo(90.0f, 116.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                lineTo(40.0f, 72.0f)
                close()
                moveTo(120.0f, 158.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, -26.0f)
                lineTo(40.0f, 132.0f)
                verticalLineToRelative(52.0f)
                lineTo(94.0f, 184.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 120.0f, 158.0f)
                close()
                moveTo(248.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(169.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 56.59f, 11.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, 9.61f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 248.0f, 152.0f)
                close()
                moveTo(231.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f)
                close()
            }
        }
        .build()
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
