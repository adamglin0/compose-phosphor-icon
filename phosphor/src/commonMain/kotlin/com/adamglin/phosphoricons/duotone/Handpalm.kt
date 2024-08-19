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

public val DuotoneGroup.Handpalm: ImageVector
    get() {
        if (_handpalm != null) {
            return _handpalm!!
        }
        _handpalm = Builder(name = "Handpalm", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 116.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -160.0f, 0.0f)
                verticalLineTo(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineTo(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineTo(60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 88.0f)
                arcToRelative(27.75f, 27.75f, 0.0f, false, false, -12.0f, 2.71f)
                lineTo(176.0f, 60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -41.36f, -24.6f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 80.0f, 44.0f)
                verticalLineToRelative(6.71f)
                arcTo(27.75f, 27.75f, 0.0f, false, false, 68.0f, 48.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 40.0f, 76.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                lineTo(216.0f, 116.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 188.0f, 88.0f)
                close()
                moveTo(200.0f, 152.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -144.0f, 0.0f)
                lineTo(56.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(96.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(68.67f)
                arcTo(48.08f, 48.08f, 0.0f, false, false, 120.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(176.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handpalm!!
    }

private var _handpalm: ImageVector? = null
