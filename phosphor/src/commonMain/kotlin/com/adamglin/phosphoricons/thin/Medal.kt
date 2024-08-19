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

public val ThinGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 96.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 76.0f, 161.9f)
                lineTo(76.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 1.79f, -0.42f)
                lineTo(128.0f, 220.47f)
                lineToRelative(46.22f, 23.11f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 180.0f, 240.0f)
                lineTo(180.0f, 161.9f)
                arcTo(83.89f, 83.89f, 0.0f, false, false, 212.0f, 96.0f)
                close()
                moveTo(172.0f, 233.53f)
                lineToRelative(-42.22f, -21.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f)
                lineTo(84.0f, 233.53f)
                verticalLineToRelative(-66.0f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, false, 88.0f, 0.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, -76.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 172.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 52.0f, 52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 128.0f, 44.0f)
                close()
                moveTo(128.0f, 140.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 128.0f, 140.0f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
