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

public val LightGroup.FileTxt: ImageVector
    get() {
        if (_fileTxt != null) {
            return _fileTxt!!
        }
        _fileTxt = Builder(name = "FileTxt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(146.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(214.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.76f, -4.24f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 48.0f, 118.0f)
                close()
                moveTo(158.0f, 46.48f)
                lineTo(193.52f, 82.0f)
                lineTo(158.0f, 82.0f)
                close()
                moveTo(152.88f, 155.48f)
                lineTo(135.37f, 180.0f)
                lineToRelative(17.51f, 24.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.76f, 7.0f)
                lineTo(128.0f, 190.32f)
                lineToRelative(-15.12f, 21.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.76f, -7.0f)
                lineTo(120.63f, 180.0f)
                lineToRelative(-17.51f, -24.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 9.76f, -7.0f)
                lineTo(128.0f, 169.68f)
                lineToRelative(15.12f, -21.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.76f, 7.0f)
                close()
                moveTo(90.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(70.0f, 158.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(58.0f, 158.0f)
                lineTo(44.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(84.0f, 146.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 90.0f, 152.0f)
                close()
                moveTo(218.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(198.0f, 158.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(186.0f, 158.0f)
                lineTo(172.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 218.0f, 152.0f)
                close()
            }
        }
        .build()
        return _fileTxt!!
    }

private var _fileTxt: ImageVector? = null
