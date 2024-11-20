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

public val BoldGroup.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) {
            return _castleTurret!!
        }
        _castleTurret = Builder(name = "CastleTurret", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 212.0f)
                horizontalLineTo(204.0f)
                verticalLineTo(117.0f)
                lineToRelative(10.14f, -10.14f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 220.0f, 92.69f)
                verticalLineTo(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 48.0f)
                verticalLineTo(92.69f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 5.86f, 14.14f)
                lineTo(52.0f, 117.0f)
                verticalLineToRelative(95.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(72.49f, 103.51f)
                lineTo(60.0f, 91.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(52.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(52.0f)
                horizontalLineToRelative(28.0f)
                verticalLineTo(91.0f)
                lineToRelative(-12.49f, 12.48f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 180.0f, 112.0f)
                verticalLineTo(212.0f)
                horizontalLineTo(164.0f)
                verticalLineTo(168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                verticalLineToRelative(44.0f)
                horizontalLineTo(76.0f)
                verticalLineTo(112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.49f, 103.51f)
                close()
                moveTo(140.0f, 212.0f)
                horizontalLineTo(116.0f)
                verticalLineTo(168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
