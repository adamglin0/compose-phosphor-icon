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

public val BoldGroup.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) {
            return _codepenLogo!!
        }
        _codepenLogo = Builder(name = "CodepenLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.68f, 85.43f)
                lineToRelative(-104.0f, -56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.38f, 0.0f)
                lineToRelative(-104.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.32f, 10.57f)
                lineToRelative(104.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.38f, 0.0f)
                lineToRelative(104.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 160.0f)
                lineTo(244.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 237.68f, 85.43f)
                close()
                moveTo(220.0f, 139.91f)
                lineTo(197.88f, 128.0f)
                lineTo(220.0f, 116.09f)
                close()
                moveTo(172.57f, 114.37f)
                lineTo(140.0f, 96.83f)
                lineTo(140.0f, 60.09f)
                lineTo(206.69f, 96.0f)
                close()
                moveTo(128.0f, 138.37f)
                lineTo(108.74f, 128.0f)
                lineTo(128.0f, 117.63f)
                lineTo(147.26f, 128.0f)
                close()
                moveTo(116.0f, 60.09f)
                lineTo(116.0f, 96.83f)
                lineTo(83.43f, 114.37f)
                lineTo(49.31f, 96.0f)
                close()
                moveTo(36.0f, 116.09f)
                lineTo(58.12f, 128.0f)
                lineTo(36.0f, 139.91f)
                close()
                moveTo(83.43f, 141.63f)
                lineTo(116.0f, 159.17f)
                verticalLineToRelative(36.74f)
                lineTo(49.31f, 160.0f)
                close()
                moveTo(140.0f, 195.91f)
                lineTo(140.0f, 159.17f)
                lineToRelative(32.57f, -17.54f)
                lineTo(206.69f, 160.0f)
                close()
            }
        }
        .build()
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
