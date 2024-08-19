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

public val LightGroup.Vinylrecord: ImageVector
    get() {
        if (_vinylrecord != null) {
            return _vinylrecord!!
        }
        _vinylrecord = Builder(name = "Vinylrecord", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(128.0f, 70.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, true, 70.0f, -70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(198.0f, 128.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, true, -70.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, 58.0f, -58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(158.0f, 128.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, 30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 158.0f, 128.0f)
                close()
                moveTo(110.0f, 128.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 110.0f, 128.0f)
                close()
            }
        }
        .build()
        return _vinylrecord!!
    }

private var _vinylrecord: ImageVector? = null
