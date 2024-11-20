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

public val ThinGroup.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) {
            return _speakerSimpleSlash!!
        }
        _speakerSimpleSlash = Builder(name = "SpeakerSimpleSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 152.0f)
                lineTo(196.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(232.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(236.0f, 88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 84.0f)
                close()
                moveTo(219.0f, 213.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.92f, 5.38f)
                lineToRelative(-49.0f, -53.94f)
                lineTo(164.08f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.24f, 3.59f)
                arcTo(3.92f, 3.92f, 0.0f, false, true, 160.0f, 228.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -2.46f, -0.84f)
                lineTo(86.63f, 172.0f)
                lineTo(40.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(28.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 84.0f)
                lineTo(90.59f, 84.0f)
                lineTo(53.0f, 42.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 59.0f, 37.31f)
                close()
                moveTo(156.0f, 156.0f)
                lineTo(97.87f, 92.0f)
                lineTo(40.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(88.0f, 164.0f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, 2.46f, 0.84f)
                lineToRelative(65.54f, 51.0f)
                close()
                moveTo(122.61f, 66.2f)
                lineTo(156.0f, 40.2f)
                verticalLineToRelative(66.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(164.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.46f, -3.16f)
                lineToRelative(-39.85f, 31.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.92f, 6.31f)
                close()
            }
        }
        .build()
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
