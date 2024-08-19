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

public val LightGroup.Handbagsimple: ImageVector
    get() {
        if (_handbagsimple != null) {
            return _handbagsimple!!
        }
        _handbagsimple = Builder(name = "Handbagsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.9f, 198.36f)
                lineToRelative(-14.25f, -120.0f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, false, -14.0f, -12.36f)
                horizontalLineTo(174.0f)
                verticalLineTo(64.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(46.33f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, false, -14.0f, 12.36f)
                lineToRelative(-14.25f, 120.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 15.64f)
                horizontalLineTo(223.92f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -15.64f)
                close()
                moveTo(94.0f, 64.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(94.0f)
                close()
                moveTo(225.5f, 201.3f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, -1.58f, 0.7f)
                horizontalLineTo(32.08f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, -1.58f, -0.7f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, -0.49f, -1.53f)
                lineToRelative(14.26f, -120.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.33f, 78.0f)
                horizontalLineTo(209.67f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.06f, 1.77f)
                lineToRelative(14.26f, 120.0f)
                arcTo(1.92f, 1.92f, 0.0f, false, true, 225.5f, 201.3f)
                close()
            }
        }
        .build()
        return _handbagsimple!!
    }

private var _handbagsimple: ImageVector? = null
