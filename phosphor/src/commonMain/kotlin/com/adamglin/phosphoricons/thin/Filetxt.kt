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

public val ThinGroup.Filetxt: ImageVector
    get() {
        if (_filetxt != null) {
            return _filetxt!!
        }
        _filetxt = Builder(name = "Filetxt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(212.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                close()
                moveTo(156.0f, 41.65f)
                lineTo(198.34f, 84.0f)
                lineTo(156.0f, 84.0f)
                close()
                moveTo(151.25f, 154.32f)
                lineTo(132.92f, 180.0f)
                lineToRelative(18.33f, 25.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.5f, 4.65f)
                lineTo(128.0f, 186.88f)
                lineToRelative(-16.75f, 23.44f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.5f, -4.65f)
                lineTo(123.08f, 180.0f)
                lineToRelative(-18.33f, -25.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.5f, -4.65f)
                lineTo(128.0f, 173.12f)
                lineToRelative(16.75f, -23.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.5f, 4.65f)
                close()
                moveTo(88.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(68.0f, 156.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(60.0f, 156.0f)
                lineTo(44.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(84.0f, 148.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 88.0f, 152.0f)
                close()
                moveTo(216.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(196.0f, 156.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(188.0f, 156.0f)
                lineTo(172.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 152.0f)
                close()
            }
        }
        .build()
        return _filetxt!!
    }

private var _filetxt: ImageVector? = null
