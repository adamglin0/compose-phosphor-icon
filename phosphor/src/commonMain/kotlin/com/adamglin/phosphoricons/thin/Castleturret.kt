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

public val ThinGroup.Castleturret: ImageVector
    get() {
        if (_castleturret != null) {
            return _castleturret!!
        }
        _castleturret = Builder(name = "Castleturret", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 220.0f)
                horizontalLineTo(196.0f)
                verticalLineTo(113.66f)
                lineToRelative(12.49f, -12.49f)
                arcTo(11.93f, 11.93f, 0.0f, false, false, 212.0f, 92.69f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(148.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(84.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 48.0f)
                verticalLineTo(92.69f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 3.51f, 8.48f)
                lineTo(60.0f, 113.66f)
                verticalLineTo(220.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(66.83f, 109.17f)
                lineTo(53.17f, 95.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 92.69f)
                verticalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(76.0f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(92.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.17f, 2.82f)
                lineToRelative(-13.66f, 13.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 188.0f, 112.0f)
                verticalLineTo(220.0f)
                horizontalLineTo(156.0f)
                verticalLineTo(168.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(52.0f)
                horizontalLineTo(68.0f)
                verticalLineTo(112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 66.83f, 109.17f)
                close()
                moveTo(148.0f, 220.0f)
                horizontalLineTo(108.0f)
                verticalLineTo(168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                close()
            }
        }
        .build()
        return _castleturret!!
    }

private var _castleturret: ImageVector? = null
