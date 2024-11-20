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

public val LightGroup.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.0f, 88.0f)
                verticalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(214.0f, 40.0f)
                verticalLineTo(224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(174.0f)
                horizontalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                curveToRelative(0.0f, -4.41f, 0.68f, -108.25f, 59.64f, -133.51f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 40.0f)
                close()
                moveTo(202.0f, 50.0f)
                curveToRelative(-36.79f, 24.29f, -42.82f, 91.48f, -43.81f, 112.0f)
                horizontalLineTo(202.0f)
                close()
                moveTo(117.92f, 39.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.84f, 2.0f)
                lineTo(114.0f, 88.48f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -68.0f, 0.0f)
                lineTo(53.92f, 41.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.84f, -2.0f)
                lineToRelative(-8.0f, 48.0f)
                arcTo(6.61f, 6.61f, 0.0f, false, false, 34.0f, 88.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, false, 40.0f, 45.6f)
                verticalLineTo(224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(133.6f)
                arcTo(46.06f, 46.06f, 0.0f, false, false, 126.0f, 88.0f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, false, -0.08f, -1.0f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
